package br.com.etechoracio.study.service;

import br.com.etechoracio.study.entity.Disciplina;
import br.com.etechoracio.study.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;

    //Listar disciplinas
    public List<Disciplina> listar()
    {
        return repository.findAll();
    }

    //Buscar por Id
    public Disciplina buscarPorId(Long id)
    {
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        return null;
    }

    //Cadastrar disciplina
    public Disciplina cadastrar(Disciplina disciplina)
    {
        return repository.save(disciplina);
    }

    //Alterar disciplina
    public Disciplina alterar(Disciplina disciplina)
    {
        var existe = buscarPorId(disciplina.getId());
        if (existe != null)
            return repository.save(disciplina);
        else{
            System.out.println("Disciplina não encontrada");
            return null;
        }
    }

    //Deletar disciplina
    public void excluir(Long id)
    {
        var existe = buscarPorId(id);
        if(existe != null)
        repository.deleteById(id);
    }
}
