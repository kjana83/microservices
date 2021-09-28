package com.jk.sessions.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Speaker {
    private Long speakerId;
    private String name;
    private String description;
}
