package com.zdpzsp.note.web;

import com.opensymphony.xwork2.ActionSupport;

import java.io.InputStream;

/**
 * Created by zhangdepeng on 16/3/11.
 */
public class NoteAction  extends ActionSupport {
    private InputStream inputStream;
    public String getDictories(){

        return "data";
    }

}
