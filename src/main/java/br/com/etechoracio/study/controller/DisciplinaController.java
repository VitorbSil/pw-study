package br.com.etechoracio.study.controller;


import br.com.etechoracio.study.entity.Disciplina;
import br.com.etechoracio.study.service.DisciplinaService;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/disciplina")
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
    public void escluir(@PathVariable ("id") Long id)
    {
        service.excluir(id);
    }
}