package com.apkplug.plugindemo;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
public class SimpleBundle implements BundleActivator
{
    public void start(BundleContext context) throws Exception
    {
        System.out.println("Simple Bundle " + context.getBundle().getBundleId()
            + " has started.");
        //保存插件上下文BundleContext 在Activity中使用
        BundleContextFactory.getInstance().setBundleContext(context);
    }
   
    public void stop(BundleContext context)
    {
        System.out.println("Simple Bundle " + context.getBundle().getBundleId()
            + " has stopped.");
      
    }
}
