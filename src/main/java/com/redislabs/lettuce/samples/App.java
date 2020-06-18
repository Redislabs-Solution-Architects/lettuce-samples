package com.redislabs.lettuce.samples;

import com.redislabs.picocliredis.RedisApplication;
import com.redislabs.picocliredis.RedisCommandLineOptions;
import io.lettuce.core.RedisURI;
import picocli.CommandLine;

@CommandLine.Command(name = "lettuce-samples", subcommands = {ConnectionPooling.class})
public class App extends RedisApplication {

    @CommandLine.Mixin
    private RedisCommandLineOptions redisCommandLineOptions = RedisCommandLineOptions.builder().build();

    public RedisURI getRedisURI() {
        return redisCommandLineOptions.getRedisURI();
    }

    public static void main(String[] args) {
        System.exit(new App().execute(args));
    }

}
