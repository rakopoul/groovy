import jenkins.model.*
import java.util.logging.Logger


jenkins = Jenkins.instance;
Logger logger = Logger.getLogger("")

logger.info "Executing init script"

jenkins.setDisableRememberMe(true)
jenkins.setSystemMessage('<h1>Jenkins Server - Automating Jenkins with Groovy</h1>')
jenkins.save()

logger.info "Init script complete"
