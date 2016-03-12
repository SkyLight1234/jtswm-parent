package com.zdpzsp.note.web;

import com.opensymphony.xwork2.ActionSupport;
import com.zdpzsp.note.service.INoteService;

import java.io.InputStream;

/**
 * Created by zhangdepeng on 16/3/11.
 */
public class NoteAction  extends ActionSupport {
    private InputStream inputStream;
    private INoteService noteService;
    public String getDictories(){

        return "data";
    }

    public INoteService getNoteService() {
        return noteService;
    }

    public void setNoteService(INoteService noteService) {
        this.noteService = noteService;
    }

}
