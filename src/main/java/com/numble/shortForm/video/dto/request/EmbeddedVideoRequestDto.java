package com.numble.shortForm.video.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Getter
@Setter
@ToString
public class EmbeddedVideoRequestDto {

    private String title;

    private String videoUrl;

    private String context;

    private MultipartFile thumbNail;

    private List<String> tags;

}
