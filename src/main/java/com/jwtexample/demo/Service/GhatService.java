package com.jwtexample.demo.Service;

import com.jwtexample.demo.Repositories.GhatRepository;
import com.jwtexample.demo.entities.Ghat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GhatService {

    @Autowired
    private GhatRepository ghatRepository;

    public List<Ghat> getGhat() {
        return ghatRepository.findAll();
    }

    public Ghat addGhat(Ghat newghat) {
        ghatRepository.save(newghat);
        return newghat;
    }


}
