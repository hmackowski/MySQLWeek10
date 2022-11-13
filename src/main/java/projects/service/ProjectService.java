/**
 * 
 */
package projects.service;

import java.util.List;
import java.util.NoSuchElementException;

import projects.dao.ProjectDao;
import projects.entity.Project;

/**
 * @author hmack
 *
 */
public class ProjectService {

	private ProjectDao projectDao = new ProjectDao();

	/**
	 * @param project
	 * @return
	 */
	public Project addProject(Project project) {

		return projectDao.insertProject(project);
	}

	/**
	 * @return
	 */
	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}

	/**
	 * @param projectId
	 * @return
	 */
	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectsById(projectId).orElseThrow(
				() -> new NoSuchElementException("Project with project ID=" + projectId + " does not exist."));
	}

}
