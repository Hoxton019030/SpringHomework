package tw.ispan.springdemo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("light")
@PropertySource("classpath:light.properties")
public class LightBean {

//	@Value("#{props.id}")   // 用 xml 設定的寫法
	@Value("${id}")  // 用 Annotation 設定的寫法
	private Integer id;

	@Value("${red}")
	private Integer red;

	@Value("${green}")
	private Integer green;

	@Value("${yellow}")
	private Integer yellow;

	public LightBean() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

	public Integer getGreen() {
		return green;
	}

	public void setGreen(Integer green) {
		this.green = green;
	}

	public Integer getYellow() {
		return yellow;
	}

	public void setYellow(Integer yellow) {
		this.yellow = yellow;
	}

}
