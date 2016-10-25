package com.owen.springcloud.cloudfeign.service;

import com.owen.springcloud.cloudfeign.model.Contributor;
import com.owen.springcloud.cloudfeign.model.GitHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by owen on 2016/10/25.
 */
@Service("gitHubService")
public class GitHubService implements GitHub {
    @Autowired
    private GitHub feignGitHub;

    @Override
    public ResponseEntity<List<Contributor>> contributors(String owner, String repo) {
        return this.feignGitHub.contributors(owner, repo);
    }
}
