DROP TABLE IF EXISTS answer;
DROP TABLE IF EXISTS question;
DROP TABLE IF EXISTS test;

CREATE TABLE test (
                       test_id BIGSERIAL PRIMARY KEY,
                       test_name VARCHAR(255)
);

CREATE TABLE question (
                          question_id BIGSERIAL PRIMARY KEY,
                          question_text VARCHAR(255),
                          test_id INT,
                          FOREIGN KEY (test_id) REFERENCES test(test_id)
);

CREATE TABLE answer (
                        answer_id BIGSERIAL PRIMARY KEY,
                        answer_text VARCHAR(255),
                        is_correct BOOLEAN,
                        question_id INT,
                        FOREIGN KEY (question_id) REFERENCES question(question_id)
);