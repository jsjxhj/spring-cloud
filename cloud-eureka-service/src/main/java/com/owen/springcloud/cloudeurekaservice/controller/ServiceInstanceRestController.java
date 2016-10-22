package com.owen.springcloud.cloudeurekaservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 该服务提供获取注册管理器上所有服务及其实例的接口，
 * 根据指定的在注册服务器上注册的服务名称来获取该服务的实例。
 * Created by owen on 2016/10/21.
 */
@RestController
@RequestMapping("/service-instances")
public class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取注册管理器中注册的所有服务及服务名下的所有服务实例
     * @return Map<String, List<ServiceInstance>>  key: applicationName, value：该服务名下的所有服务实例
     */
    @RequestMapping(method = RequestMethod.GET)
    public Map<String, List<ServiceInstance>> getServiceInstances() {

        Map<String, List<ServiceInstance>> serviceMap = new HashMap<String, List<ServiceInstance>>();

        List<String> serviceIds = discoveryClient.getServices();
        if (!CollectionUtils.isEmpty(serviceIds)) {
            for (String serviceId : serviceIds) {
                System.out.println("serviceId:" + serviceId);
                List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceId);
                serviceMap.put(serviceId, serviceInstances);
            }
        }

        return serviceMap;
    }

    /**
     * 根据服务名获取该服务名下的所有服务实例
     * @param applicationName 在注册管理器中注册的服务的名字
     * @return Map<String, List<ServiceInstance>>  key: applicationName, value：该服务名下的所有服务实例
     */
    @RequestMapping(value = "/{applicationName}", method = RequestMethod.GET)
    public Map<String, List<ServiceInstance>> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {

        Map<String, List<ServiceInstance>> serviceMap = new HashMap<String, List<ServiceInstance>>();
        List<ServiceInstance> serviceInstances = this.discoveryClient.getInstances(applicationName);
        serviceMap.put(applicationName, serviceInstances);

        return serviceMap;
    }
}
