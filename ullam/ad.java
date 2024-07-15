Observable.zip(obs1, obs2, obs3, (a, b, c) -> a + b + c).subscribe(System.out::println);
