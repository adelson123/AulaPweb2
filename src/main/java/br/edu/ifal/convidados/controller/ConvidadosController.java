package br.edu.ifal.convidados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifal.convidados.model.Convidado;
import br.edu.ifal.convidados.model.Convidados;


@Controller
public class ConvidadosController{

    @Autowired
    private Convidados convidados;

    @RequestMapping("/convidados")
    public ModelAndView listar(){
        
        ModelAndView mv = new ModelAndView("ListaConvidados");
        mv.addObject(new Convidado());
        mv.addObject("convidados", convidados.todos());
        return mv;  
    }

    @RequestMapping (value="/convidados",method = RequestMethod.POST)
    public String salvar(Convidado convidado){
        this.convidados.adicionar(convidado);
        return"redirect:/convidados";
    } 
}