package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;

@Service
public class workFlowService {
    List<WorkFlow> list = new ArrayList<>();

    public List obtainList()
    {
        return this.list;
    }

    public void create(WorkFlow workFlow){
        this.list.add(workFlow);
    }
}
