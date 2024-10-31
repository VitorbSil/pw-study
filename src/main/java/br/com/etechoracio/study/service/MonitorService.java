package br.com.etechoracio.study.service;

import br.com.etechoracio.study.entity.Disciplina;
import br.com.etechoracio.study.entity.Monitor;
import br.com.etechoracio.study.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository repository;

    //Listar monitores
    public List<Monitor> listar()
    {
        return repository.findAll();
    }

    //Buscar por Id
    public Monitor buscarPorId(Long id)
    {
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        return null;
    }

    //Cadastrar monitor
    public Monitor cadastrar(Monitor monitor)
    {
        return repository.save(monitor);
    }

    //Alterar monitor
    public Monitor alterar(Monitor monitor)
    {
        var existe = buscarPorId(monitor.getId());
        if (existe != null)
            return repository.save(monitor);
        else{
            System.out.println("Monitor não encontrado");
            return null;
        }
    }

    //Deletar monitor
    public void excluir(Long id)
    {
        var existe = buscarPorId(id);
        if(existe != null)
            repository.deleteById(id);
    }















}
