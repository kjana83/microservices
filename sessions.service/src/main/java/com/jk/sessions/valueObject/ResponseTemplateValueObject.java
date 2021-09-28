package com.jk.sessions.valueObject;

import com.jk.sessions.entity.Session;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateValueObject {

    private Session session;
    private Speaker speaker;
}
