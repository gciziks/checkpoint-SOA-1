package br.com.fiap.checkpoint1.service;

import br.com.fiap.checkpoint1.model.Pedido;
import br.com.fiap.checkpoint1.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public Pedido criarPedido(Pedido pedido) {
        if (pedido.getValorTotal() < 0) {
            throw new IllegalArgumentException("Total não pode ser negativo!");
        }
        return pedidoRepository.save(pedido);
    }

    public Pedido atualizarPedido(Long id, Pedido pedidoAtualizado) {
        if (!pedidoRepository.existsById(id)) {
            throw new IllegalArgumentException("Pedido não encontrado!");
        }
        pedidoAtualizado.setId(id);
        return pedidoRepository.save(pedidoAtualizado);
    }

    public void removerPedido(Long id) {
        if (!pedidoRepository.existsById(id)) {
            throw new IllegalArgumentException("Pedido não encontrado!");
        }
        pedidoRepository.deleteById(id);
    }
}
