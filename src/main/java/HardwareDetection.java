import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import java.awt.*;

@Mojo(name="deneme",defaultPhase = LifecyclePhase.COMPILE)
public class HardwareDetection extends AbstractMojo  {
    @Override
    public void execute() {
        getLog().info("Current Operation System : " + System.getProperty("os.name"));
        getLog().info("Number of Processors : " + Runtime.getRuntime().availableProcessors());
        getLog().info("Max Memory : " + Runtime.getRuntime().maxMemory());
        getLog().info("Available Memory : " + Runtime.getRuntime().freeMemory());
        getLog().info("Java Version : " + System.getProperty("java.version"));
        getLog().info("Screen Width : " + Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        getLog().info("Screen Height : " + Toolkit.getDefaultToolkit().getScreenSize().getHeight());
    }
}
