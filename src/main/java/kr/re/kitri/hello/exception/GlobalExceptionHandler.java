package kr.re.kitri.hello.exception;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLInvalidAuthorizationSpecException;

/*
* Exception 을 사용자 정의로 만들경우 'exception 코드' 를 만들어서
* 코드번호로 쉽게 처리할 수 있는 정책을 만드는 것이 좋다.
* */

//@ControllerAdvice
//@RestController // 일종의 컨트롤러 역할을 하는 것이다.
@RestControllerAdvice//(@ControllerAdvice + @RestController)
public class GlobalExceptionHandler {

    @ExceptionHandler(value = SQLInvalidAuthorizationSpecException.class)
    public String handlerSQLInvalidException(SQLInvalidAuthorizationSpecException se) {
        return "데이터베이스 접속에 문제가 있습니다." + se.getMessage();
    }

    @ExceptionHandler(value = ArithmeticException.class)
    public String handlerArithException(ArithmeticException ae) {
        return "0으로 나누는 에러가 발생" + ae.getMessage();
    }

    @ExceptionHandler(value = SQLException.class)
    public String handleSQLException(SQLException se) {
        return "SQL 예외 발생";
    }

    // BadSqlGrammerException 이 sql 라이브러리안에 있는 SyntaxException 을 wrapping 하기 때문에
    // 늘 이를 잘 생각해야한다.
    @ExceptionHandler(value = BadSqlGrammarException.class)
    public String handleBadSQLGException()
    {
        return "SQL 예외 발생";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleAll(Exception e) {
        return "기타등등 예외를 모두 여기서 잡아버립니다." + e;
    }

}
