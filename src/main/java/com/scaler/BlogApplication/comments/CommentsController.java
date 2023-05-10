package com.scaler.BlogApplication.comments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/blogs/{blogId}/comments")
public class CommentsController {
}
