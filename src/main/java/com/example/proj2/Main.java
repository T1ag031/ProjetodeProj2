package com.example.proj2;

import com.example.proj2.BLL.*;
import com.example.proj2.DAL.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*Cliente cli= new Cliente();
        cli.setCodpostal("123456");
        cli.setEmail("abcd@gmail.com");
        cli.setNome("aaaaaa");
        cli.setNif(123);
        cli.setNporta(1);
        cli.setRua("rua");
        cli.setPassword("pass");
        cli.setUsername("user");

        ClienteBLL.create(cli);*/


        /*Fornecedor f1 = new Fornecedor();

        f1.setNif(321);
        f1.setNporta(2);
        f1.setRua("rrua");
        f1.setNome("TTTTTT");
        f1.setCodpostal("123456");
        f1.setPassword("fo*rnecedor");
        f1.setUsername("fornecedor");

        FornecedorBLL.create(f1);*/

        //System.out.println();

        /*Fornecedor f1 = FornecedorBLL.findFornecedor(3);

    System.out.println("Nome: " + f1.getNome());*/

        //Venda p1 = VendaBLL.findVenda(1);
        //System.out.println("Cliente: " + p1.getCodcliente() + "\nNome: " + p1.getClienteByCodcliente().getNome() + "\npreco: " + p1.getValortotal());
        /*VendaBLL.deleteVenda(1);
        ClienteBLL.deleteCliente(2);*/

        /*
        ClienteBLL.editPasswordCliente(1, "TIAGO");

        ClienteBLL.editUserCliente(1, "TIAGO");*/

        /*
        int n = ClienteBLL.getClienteCount();

        System.out.println(n);*/
        //CodPostalBLL.editLocalidadeCodPostal("123456","Braga");

        //EncomendaBLL.editValorEncomenda(1, 56);

        /*FornecedorBLL.editNifFornecedor(6, 123123);
        FornecedorBLL.editNomeFornecedor(6, "José");
        FornecedorBLL.editRuaFornecedor(6, "Travessa");
        FornecedorBLL.editNPortaFornecedor(6, 31);
        FornecedorBLL.editUsernameFornecedor(6, "ze");
        FornecedorBLL.editPassFornecedor(6, "ze");
         */

        /*PecaBLL.editNomePeca(1, "peca");
        PecaBLL.editValorPeca(1, 21);
        PecaBLL.editQtdPeca(1, 78);

         */

        //TecidoBLL.editDescTecido(1, "90%cotton");

        //VendaBLL.editValorVenda(1, 12);

        /*int n = CodPostalBLL.getCPostalCount();
        System.out.println(n);*/
        //ClienteBLL.login(2, "jao");

        //ClienteBLL.login("TIAGO", "TIAGO", 1);

        //Cliente cliente = ClienteBLL.findClientebyName("Tiago");
        //System.out.println(cliente.getNome());

        //ClienteBLL.login(1, "TIAGO");

        //for(Cliente c: ClienteBLL.findClienteEntities()){
        //    System.out.println("ID DE CLIENTE: "+c.getCodcliente()+" USERNAME: "+c.getUsername());
        //
        // }
        try{
            //Encomenda c = EncomendaBLL.findByDate(Date.pa(2022-04-22));
            //Substituir pelas labels
            //System.out.println("Num Encomenda: " + c.getData() + "\nData: " +c.getData() + "\nValor Total: " + c.getValortotal());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        //EncomendaBLL.deleteEncomenda(1);
    }
}