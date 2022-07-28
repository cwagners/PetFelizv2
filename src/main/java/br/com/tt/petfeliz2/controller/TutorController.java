package br.com.tt.petfeliz2.controller;

import br.com.tt.petfeliz2.controller.dto.TutorCriacao;
import br.com.tt.petfeliz2.model.Cuidador;
import br.com.tt.petfeliz2.model.Tutor;
import br.com.tt.petfeliz2.service.TutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class TutorController {

    private TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }
        @GetMapping("/api/tutores")
        public List<Tutor> getTutores(){
            return tutorService.getTutores();
        }

        @PostMapping("/api/tutores")
        public ResponseEntity criar(@RequestBody TutorCriacao tutorCriacao){

            Tutor tutor = tutorService.criar(tutorCriacao);
            Long id = tutor.getId();
            return ResponseEntity.created(URI.create("/api/tutor/"+id)).build();


        }
    }



