package br.com.tt.petfeliz2.controller;

import br.com.tt.petfeliz2.controller.dto.EnderecoCriacaoRequest;
import br.com.tt.petfeliz2.controller.dto.HorarioCriacaoRequest;
import br.com.tt.petfeliz2.controller.dto.TelefoneCriacaoRequest;
import br.com.tt.petfeliz2.service.InformacoesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdministracaoWebController {

    private InformacoesService informacoesService;
    public AdministracaoWebController(InformacoesService informacoesService){
        this.informacoesService = informacoesService;
    }

    @GetMapping
    public String getPaginaInicial(Model model){
        model.addAttribute("nomeAplicacao","PetFeliz");
        return "admin";
    }

    @GetMapping("/telefone-cadastrar")
    public String getPaginaTelefoneCadastrar(){
        return "telefone-cadastrar";

    }

    @PostMapping("/action/telefone-cadastrar")
    public String actionTelefoneCadastrar(TelefoneCriacaoRequest telefone){
        informacoesService.cadastrarTelefone(telefone.getNumero());
        return "redirect:/admin/telefone-cadastrar";
    }

    @GetMapping("/endereco-cadastrar")
    public String getPaginaEnderecoCadastrar(){
        return "endereco-cadastrar";
    }
    @PostMapping("/action/endereco-cadastrar")
        public String actionEnderecoCadastrar(EnderecoCriacaoRequest logradouro){
            informacoesService.cadastrarEndereco(logradouro.getEndereco());
            return "redirect:/admin/endereco-cadastrar";
        }

    @GetMapping("/horario-cadastrar")
    public String getPaginaHorarioCadastrar(){
        return "horario-cadastrar";
    }
    @PostMapping("/action/horario-cadastrar")
    public String actionEnderecoCadastrar(HorarioCriacaoRequest hora){
        informacoesService.cadastrarHorario(hora.getHorario());
        return "redirect:/admin/horario-cadastrar";
    }
    }





