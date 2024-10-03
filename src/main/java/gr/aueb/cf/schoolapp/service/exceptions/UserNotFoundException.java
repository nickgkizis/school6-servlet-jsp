package gr.aueb.cf.schoolapp.service.exceptions;

import gr.aueb.cf.schoolapp.model.Teacher;

import java.io.Serial;

public class UserNotFoundException extends Exception{

    @Serial
    private static final long serialVersionUID = 1L;

    public UserNotFoundException(Teacher teacher) {
        super("Teacher: "+teacher.getId()+" not found");
    }

    public UserNotFoundException(String s) {
        super(s);
    }
}
