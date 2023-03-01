package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{
    private long studentId;

    public long getStudentId() {
        return studentId;
    }

    public StudentNotFoundException (String message, long studentId) {
        super(message);
        this.studentId = studentId;
    }
}
