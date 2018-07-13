package com.apispringboot.ayko.topics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class topicsController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<topic> getAllTopics()
    {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody topic newTopic)
    {
        topicService.addTopic(newTopic);
    }

    /*
    // ismi farkli yazarsak belirtmek zorundayiz.
    @RequestMapping("/topics/{idgeldi}")
    public topic getTopic(@PathVariable("idgeldi") String id)
    {
        return topicService.getTopic(id);
    }
     */

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopic(@PathVariable String id,@RequestBody topic newTopic)
    {
        topicService.updateTopic(id,newTopic);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public String deleteTopic(@PathVariable String id)
    {
        return topicService.deleteTopic(id);
    }

}
