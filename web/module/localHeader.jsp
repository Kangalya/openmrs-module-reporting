<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<div style="border-bottom: 1px solid black;">
	<ul id="menu">
		<li class="first">
			<a href="index.htm" style="text-decoration:none;"><spring:message code="@MODULE_ID@.title" /></a>
		</li>
		<li class="">
			<a href="${pageContext.request.contextPath}/module/reporting/manageCohortDefinitions.list">Manage Cohorts</a>
		</li>	
		<li class="">
			<a href="${pageContext.request.contextPath}/module/reporting/manageDatasets.list">Manage Datasets</a>
		</li>
		<li class="">
			<a href="${pageContext.request.contextPath}/module/reporting/manageIndicators.list">Manage Indicators</a>
		</li>	
		<li class="last">
			<a href="${pageContext.request.contextPath}/module/reporting/manageReports.list">Manage Reports</a>
		</li>
	</ul>
</div>
		
				
				
		
	</ul>
</div>

