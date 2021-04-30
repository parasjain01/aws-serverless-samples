package com.myorg;

import software.amazon.awscdk.core.App;

public final class AwsApiGatewayCachingApp {
    public static void main(final String[] args) {
        App app = new App();

        new AwsApiGatewayCachingStack(app, "AwsApiGatewayCachingStack");

        app.synth();
    }
}
