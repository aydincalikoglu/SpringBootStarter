package com.apispringboot.ayko.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private topicRepository topicRepo;



    /*
    static List<topic> topics = new ArrayList<>(Arrays.asList(
            new topic("1", "s","s"),
            new topic("2", "",""),
            new topic("3", "",""),
            new topic("4", "",""),
            new topic("5", "","")
    ));
    */

    public List<topic> getAllTopics()
    {
        return (List<topic>) topicRepo.findAll();
        //return topics;
    }

    public topic getTopic(String id)
    {

        return topicRepo.findById(id).get();
        //return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }


    public void addTopic(topic newTopic)
    {
        topicRepo.save(newTopic);
        //topics.add(newTopic);
    }

    public void updateTopic(String id,topic newTopic)
    {
        topicRepo.save(newTopic);
    }


    public String deleteTopic(String id)
    {

        topicRepo.deleteById(id);
        //topics.removeIf(t-> t.getId().equals(id));
        return "success";
    }

}
