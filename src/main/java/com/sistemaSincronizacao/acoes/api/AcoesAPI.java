package com.sistemaSincronizacao.acoes.api;


import com.sistemaSincronizacao.acoes.dto.AcoesDTO;
import com.sistemaSincronizacao.acoes.facade.AcoesFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/bolsa", produces = MediaType.APPLICATION_JSON_VALUE)
public class AcoesAPI {
    @Autowired
    private AcoesFacade acoes;


    //retornar a lista de ações disponíveis
    @GetMapping("/stocks")
    @ResponseBody
    public List<AcoesDTO> getAll(){
        return acoes.getAll();
    }

    //retornar informações detalhadas de uma ação específica
    @GetMapping("/stocks/{stockId}")
    @ResponseBody
    public List<AcoesDTO> getById(@PathVariable("stockId") Long stockId){
        return acoes.getById(stockId);
    }

    //criar um novo pedido de compra/venda de ações
    @PostMapping("/orders")
    @ResponseBody
    public String createOrder(@RequestBody AcoesDTO orderRequest){
        return acoes.criar(orderRequest);
    }

}
