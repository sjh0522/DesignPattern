
class User():
    def __init__(self):
        self.username = None
        self.password = None
        self.email = None
        self.first_name = None
        self.last_name = None
        
    def __str__(self):
        return f"username: {self.username}, password: {self.password}, email: {self.email}, first_name: {self.first_name}, last_name: {self.last_name}"

class UserBuilder:
    def __init__(self):
        self.user = User()
        
    def set_username(self, username):
        self.user.username = username
        return self
        
    def set_password(self, password):
        self.user.password = password
        return self
        
    def set_email(self, email):
        self.user.email = email
        return self
        
    def set_first_name(self, first_name):
        self.user.first_name = first_name
        return self
        
    def set_last_name(self, last_name):
        self.user.last_name = last_name
        return self
    
    def build(self):
        return self.user

user = UserBuilder() \
    .set_username('john') \
    .set_password('1234') \
    .set_email('john@example.com') \
    .set_first_name('John') \
    .set_last_name('Doe') \
    .build()

print(user) # username: john, password: 1234, email: john@example    

# 장점
# 객체 생성 과정을 유연하게 처리할 수 있습니다. 객체 생성 과정이 복잡한 경우, 단계별로 처리하는 빌더 패턴을 사용하여 객체를 생성할 수 있습니다. 이렇게 하면 객체 생성 과정을 유연하게 처리할 수 있습니다.
# 객체 생성 과정을 단순화할 수 있습니다. 객체 생성 과정을 단계별로 처리하면서, 객체 생성 과정을 단순화할 수 있습니다. 이렇게 하면 코드의 가독성을 높일 수 있습니다.
# 객체 생성 시 유효성 검사를 수행할 수 있습니다. 빌더 패턴을 사용하면, 객체 생성 과정에서 유효성 검사를 수행할 수 있습니다. 예를 들어, 필수 속성이 누락되었는지, 속성값의 형식이 올바른지 등의 검사를 수행할 수 있습니다.
# 객체 생성 시 불변성을 보장할 수 있습니다. 빌더 패턴을 사용하면, 객체 생성 과정에서 불변성을 보장할 수 있습니다. 즉, 생성된 객체의 속성값을 변경할 수 없습니다. 이는 객체지향 프로그래밍의 핵심 원칙 중 하나인 "불변성 원칙"을 따르는 것입니다.

# 단점
# 빌더 클래스를 따로 구현해야 하기 때문에, 코드량이 늘어날 수 있습니다.
# 객체 생성 과정이 단계별로 처리되기 때문에, 객체 생성 시간이 더 오래 걸릴 수 있습니다. 그러나 이는 일반적으로 미미한 차이일 수 있습니다.
