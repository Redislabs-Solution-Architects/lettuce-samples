package com.redislabs.samples.lettuce;

import com.redislabs.picocliredis.AbstractRedisApplication;
import com.redislabs.picocliredis.RedisCommandLineOptions;
import io.lettuce.core.RedisURI;
import picocli.CommandLine;

@CommandLine.Command(name = "lettuce", subcommands = {ConnectionPooling.class})
public class App extends AbstractRedisApplication {

    @CommandLine.Mixin
    private RedisCommandLineOptions redisCommandLineOptions = RedisCommandLineOptions.builder().build();

    public RedisURI getRedisURI() {
        return redisCommandLineOptions.getRedisURI();
    }

    public static void main(String[] args) {
        System.exit(new App().execute(args));
    }

    @Override
    protected String getLoggerName() {
        return "com.redislabs";
    }
}
