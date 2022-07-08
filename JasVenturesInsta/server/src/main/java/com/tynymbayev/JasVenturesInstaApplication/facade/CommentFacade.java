package com.tynymbayev.JasVenturesInstaApplication.facade;

import com.tynymbayev.JasVenturesInstaApplication.dto.CommentDTO;
import com.tynymbayev.JasVenturesInstaApplication.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentFacade {

    public CommentDTO commentToCommentDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(comment.getId());
        commentDTO.setUsername(comment.getUsername());
        commentDTO.setMessage(comment.getMessage());

        return commentDTO;
    }

}
