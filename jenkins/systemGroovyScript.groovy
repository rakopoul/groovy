import jenkins.model.*
jenkins = Jenkins.instance

def svr = jenkins.instance;

def job = svr.getJob("TEST");

def sched = job.scheduleBuild2(0);

sched.get();
