package kr.domo.springboot.sample;

import lombok.Getter;

@Getter

public class Study {
    private StudyStatus studyStatus = StudyStatus.DRAFT;

    private int limit=1;

    public void updateLimit(int limit) {
        if(limit < 0) {
            throw new IllegalArgumentException("limit must be positive");
        }
    }
}
