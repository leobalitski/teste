package br.com.leonardo.teste

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
private class TesteApplication

fun main(args: Array<String>) {
	runApplication<TesteApplication>(*args)
}
