package br.com.gabriel.cleanarch.erp.casodeuso.impl;

import br.com.gabriel.cleanarch.erp.casodeuso.BuscarClientePorFiltroCasoDeUso;
import br.com.gabriel.cleanarch.erp.casodeuso.dominio.Cliente;
import br.com.gabriel.cleanarch.erp.casodeuso.portao.ClienteRepositoryPortao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuscarClientePorFiltroCasoDeUsoImpl implements BuscarClientePorFiltroCasoDeUso {

    private final ClienteRepositoryPortao clienteRepositoryPortao;

    @Override
    public Cliente execute(Cliente cliente) {

        return clienteRepositoryPortao.buscar(cliente);
    }
}
