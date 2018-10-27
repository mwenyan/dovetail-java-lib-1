package com.tibco.dovetail.core.model.flow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TasksConfig
{
    private String id;
    private String name;
    private ActivityConfig activity;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String nm)
    {
        this.name = nm;
    }

    public ActivityConfig getActivity ()
    {
        return activity;
    }

    public void setActivity (ActivityConfig activity)
    {
        this.activity = activity;
    }

}