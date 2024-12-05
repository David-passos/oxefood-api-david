package br.com.ifpe.oxefood.api.venda;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.venda.Venda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VendaRequest {

   private String cliente;

   private  String statusVenda;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataVenda;

   private String produto;

   private Double valorTotal;

   private String observacao;

   private boolean retiradaEmLoja;

   public Venda build() {

       return Venda.builder()
           .cliente(cliente)
           .statusVenda(statusVenda)
           .dataVenda(dataVenda)
           .produto(produto)
           .valorTotal(valorTotal)
           .observacao(observacao)
           .retiradaEmLoja(retiradaEmLoja)
           .build();
   }

}
