package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "SampleOpMode")
@Disabled
public class SampleOpMode extends OpMode {
    double number = 100.0;

    @Override
    public void init() {
        number = number + 100;
    }

    @Override
    public void loop() {
        telemetry.addData("My number is", number);
        telemetry.addData("Another format for telemetry", "%d, but not %f" , number, 0.05);
    }
}
