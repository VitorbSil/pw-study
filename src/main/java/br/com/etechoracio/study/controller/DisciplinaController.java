package br.com.etechoracio.study.controller;


import br.com.etechoracio.study.entity.Disciplina;
import br.com.etechoracio.study.service.DisciplinaService;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/disciplinas")
@RestController
public class DisciplinaController {
    @Autowired
    private DisciplinaService service;

    //Listar disciplinas
    @GetMapping
    public List<Disciplina> listar()
    {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Disciplina buscarPorId(@PathVariable("id") Long id)
    {
        return service.buscarPorId(id);
    }

    @GetMapping("/nome/{nome}")
    public Disciplina buscarPorNome(@PathVariable("nome") String nome)
    {
        return service.buscarPorNome(nome);
    }

    @PostMapping
    public Disciplina cadastrar(@RequestBody  Disciplina disciplina)
    {
        return service.cadastrar(disciplina);
    }

    @PutMapping("/{id}")
    public Disciplina alterar(@RequestBody Disciplina disciplina,
                              @PathVariable ("id") Long id)
    {
        if (id == disciplina.getId())
        return service.alterar(disciplina);
    else
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Disciplina> excluir(@PathVariable ("id") Long id)
    {
        if(service.buscarPorId(id) != null)
        {
            service.excluir(id);
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.notFound().build();
        }

    }
}