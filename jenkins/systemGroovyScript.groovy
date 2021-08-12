import jenkins.model.*
jenkins = Jenkins.instance

def target = binding.variables["target"]
def svr = jenkins.instance;
def job = svr.getJob(target);
def sched = job.scheduleBuild2(0);

sched.get();
