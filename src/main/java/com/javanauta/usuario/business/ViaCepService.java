package com.javanauta.usuario.business;

import com.javanauta.usuario.infrastructure.clients.ViaCepClient;
import com.javanauta.usuario.infrastructure.clients.ViaCepDTO;
import com.javanauta.usuario.infrastructure.exceptions.IllgealArgumentException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ViaCepService {

    private final ViaCepClient client;

    public ViaCepDTO buscarDadosEndereco(String cep){
        try {
            return client.buscaDadosEndereco(processarCep(cep));
        }catch (IllgealArgumentException e){
            throw new IllgealArgumentException("Erro: ", e);
        }
    }

    private String processarCep(String cep){
        String cepFormatado = cep.replace(" ", "")
                .replace("-", "");

        if(!cepFormatado.matches("\\d+")
                || !Objects.equals(cepFormatado.length(), 8)) {
            throw new IllgealArgumentException("O cep contém caracteres inválidos, favor verificar");
        }
        return cepFormatado;
    }
}
