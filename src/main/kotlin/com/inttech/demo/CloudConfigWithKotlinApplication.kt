package com.inttech.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class CloudConfigWithKotlinApplication

fun main(args: Array<String>) {
    runApplication<CloudConfigWithKotlinApplication>(*args)
}
