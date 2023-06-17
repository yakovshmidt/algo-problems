package kz.home.ys.algo.easy.robotReturnToOrigin;

import junit.framework.TestCase;

public class RobotReturnToOriginTest extends TestCase {

    public void testJudgeCircle() {
        boolean isRobotReturnToOrigin = new RobotReturnToOrigin().judgeCircle("UDULLRLRRD");

        assertTrue(isRobotReturnToOrigin);
    }
}