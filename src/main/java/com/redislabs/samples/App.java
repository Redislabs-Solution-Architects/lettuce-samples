package com.redislabs.samples;

import com.redislabs.picocliredis.HelpCommand;
import com.redislabs.picocliredis.RedisApplication;
import picocli.CommandLine;

@CommandLine.Command(name = "redis-java-samples", subcommands = {LettucePool.class})
public class App extends RedisApplication {

    public static void main(String[] args) {
        System.exit(new App().execute(args));
    }

}
