package com.orderhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")

public class PedidoController {
    @GetMapping
    public String teste() {
        return "API funcionando";
    }
}   