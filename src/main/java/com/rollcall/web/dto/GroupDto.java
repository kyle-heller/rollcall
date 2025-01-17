package com.rollcall.web.dto;

import com.rollcall.web.models.UserEntity;
import lombok.Builder;
import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class GroupDto {

    private Long id;
    @NotEmpty(message = "Group title should not be empty")
    private String title;
    @NotEmpty(message = "Photo link should not be empty")
    private String photoURL;
    @NotEmpty(message = "Content should not be empty")
    private String content;
    private UserEntity createdBy;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private List<EventDto> events;
    private String city;
    private String state;
    private int zip;

}
