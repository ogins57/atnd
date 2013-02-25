package org.tokyo.ita.controller.json;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tokyo.ita.dto.ItaAttendance;
import org.tokyo.ita.dto.PageContextDto;
import org.tokyo.ita.dto.ResultDto;
import org.tokyo.ita.service.ItaAttendanceService;
import org.tokyo.ita.service.ItaBaseService;

@RequestMapping("/attendance_json")
@Controller
public class AttendanceJSONController extends BaseJSONController<ItaAttendance> {

	@Autowired
	ItaAttendanceService attendanceService;

	@Autowired
	public void setAttendanceService(
			ItaBaseService<ItaAttendance> attendanceService) {
		this.baseService = attendanceService;
	}

	@Override
	public ResultDto create(ItaAttendance attendance) {
		debugLog(attendance);
		return super.create(attendance);
	}

	@Override
	public ItaAttendance get(@PathVariable("id") Long id) {
		System.out.println("id : " + id);
		return super.get(id);
	}

	@Override
	public List<ItaAttendance> getList(PageContextDto page,
			ItaAttendance attendance) {
		debugLog(attendance);
		return super.getList(page, attendance);
	}

	@Override
	public ResultDto update(@PathVariable("id") Long id,
			ItaAttendance attendance) {
		debugLog(attendance);
		return super.update(id, attendance);
	}

	@Override
	public ResultDto delete(@PathVariable("id") Long id) {
		System.out.println("id : " + id);
		return super.delete(id);
	}

	private void debugLog(ItaAttendance attendance) {
		System.out.println("atnd     : " + attendance.getAtnd());
		System.out.println("personId : " + attendance.getPersonId());
		System.out.println("dateId   : " + attendance.getDateId());
	}

}
