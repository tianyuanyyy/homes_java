package jp.co.lyc.cms.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import jp.co.lyc.cms.model.BpInfoModel;
import jp.co.lyc.cms.model.EmployeeModel;

@Mapper
public interface EmployeeInfoMapper {

	public void insertEmployeeInfo(EmployeeModel emp);

	// ----

	/**
	 * ログイン
	 * 
	 * @param sendMap
	 * @return
	 */

	public EmployeeModel getEmployeeModel(Map<String, String> sendMap);

	/**
	 * 社員情報を取得
	 * 
	 * @param sendMap
	 * @return
	 */
	public List<EmployeeModel> getEmployeeInfo(Map<String, Object> sendMap);

	public List<EmployeeModel> getEmployeesInfo(Map<String, Object> sendMap);

	public List<String> getEmployeeWithAdmission();

	public List<EmployeeModel> getEmployeesDevelopLanguage();

	public List<EmployeeModel> getcustomerNo();

	public List<EmployeeModel> getAdmissionStartDate();

	public List<EmployeeModel> getBpfrom();

	/**
	 * 社員情報を確認
	 * 
	 * @param sendMap
	 * @return
	 */
	public List<String> verificationEmployeeInfo();


	/**
	 * 社員情報詳細を追加
	 * 
	 */

	public void insertEmployeeInfoDetail(Map<String, Object> sendMap);

	/**
	 * 社員情報を削除
	 * 
	 */
	public void deleteEmployeeInfo(Map<String, Object> sendMap);

	/**
	 * 社員情報詳細を削除
	 * 
	 */
	public void deleteEmployeeInfoDetail(Map<String, Object> sendMap);

	/**
	 * 社員営業状況を削除
	 * 
	 */
	public void deleteEmployeeSalesSituation(Map<String, Object> sendMap);

	/**
	 * BP情報を削除
	 * 
	 */
	public void deleteBpInfoSupplement(Map<String, Object> sendMap);

	/**
	 * 住所情報を削除
	 * 
	 */
	public void deleteAddressInfo(Map<String, Object> sendMap);

	/**
	 * EmployeeNoによると、社員情報を取得
	 */
	public EmployeeModel getEmployeeByEmployeeNo(Map<String, Object> sendMap);

	/**
	 * 社員情報を修正
	 * 
	 * @param emp
	 */
	public void updateEmployeeInfo(Map<String, Object> sendMap);

	/**
	 * 社員情報詳細を修正
	 * 
	 * @param emp
	 */
	public void updateEmployeeInfoDetail(Map<String, Object> sendMap);

	/**
	 * アドレスを追加
	 * 
	 * @param emp
	 */
	public void insertAddressInfo(Map<String, Object> sendMap);

	/**
	 * アドレスを修正
	 * 
	 * @param emp
	 */
	public void updateAddressInfo(Map<String, Object> sendMap);
	
	/**
	 * 得意言語を修正
	 * 
	 * @param emp
	 */
	public void updateDevelopLanguageCode(Map<String, Object> sendMap);

	/**
	 * ログイン認証番号の電話番号存在チェック
	 * 
	 * @param employeeNo
	 * @return
	 */
	public String getEmployeePhoneNo(String employeeNo);

	/**
	 * 履歴書を追加
	 * 
	 * @param sendMap
	 */
	public void insertResumeManagement(HashMap<String, Object> sendMap);

	/**
	 * 履歴書を修正
	 * 
	 * @param sendMap
	 */
	public void updateResumeManagement(Map<String, Object> sendMap);

	/**
	 * 履歴書を削除
	 * 
	 * @param sendMap
	 */
	public void deleteResumeManagement(Map<String, Object> sendMap);

	/**
	 * BP情報更新
	 * 
	 * @param sendMap
	 */
	public void updatebpInfo(BpInfoModel bpInfoModel);

	/**
	 * BP情報更新
	 * 
	 * @param sendMap
	 */
	public void updatebpInfoAll(BpInfoModel bpInfoModel);

	/**
	 * BP情報削除
	 * 
	 * @param sendMap
	 */
	public void deletebpInfo(String bpEmployeeNo, String unitPriceStartMonth);

	/**
	 * 营业信息削除
	 * 
	 * @param sendMap
	 */
	public void deleteSalesSentence(Map<String, Object> sendMap);
	
}