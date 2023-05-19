package com.sistemaSincronizacao.acoes.facade;

import com.sistemaSincronizacao.acoes.dto.AcoesDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AcoesFacade {

    private static final Map<Long, AcoesDTO> acoes = new HashMap<>();

    public String criar(AcoesDTO acoesDTO){
        Long proximoId = acoes.keySet().size() + 1L;
        acoesDTO.setId(proximoId);
        acoes.put(proximoId, acoesDTO);
        return "Order Criada com sucesso!";
    }


    public List<AcoesDTO>  getById (Long tarefaId){
        return new ArrayList<>(Collections.singleton(acoes.get(tarefaId)));
    }

    public List<AcoesDTO> getAll(){
        return new ArrayList<>(acoes.values());
    }



}
